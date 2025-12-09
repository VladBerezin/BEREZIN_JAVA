using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace pr4
{
    public partial class Form1 : Form
    {
        int speed = 5;
        List<Label> walls;
        List<Label> obstacles;

        public Form1()
        {
            InitializeComponent();
            this.KeyPreview = true;
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            FindAllElements();
            Cursor.Position = start.PointToScreen(new Point(start.Width / 2, start.Height / 2));
            player.Location = start.Location;
        }

        private void FindAllElements()
        {
            walls = new List<Label>();
            obstacles = new List<Label>();


            foreach (Control control in GetAllControls(this))
            {
                if (control is Label label)
                {
                    // элемент по цвету
                    if (label.BackColor == Color.Lime && label.Name == "start")
                        continue;
                    else if (label.BackColor == Color.Red && label.Name == "finish")
                        continue;
                    else if (label.BackColor == Color.Gray)
                        obstacles.Add(label);
                    else if (label.BackColor == SystemColors.WindowFrame)
                        walls.Add(label);

                }
            }


        }


        private List<Control> GetAllControls(Control container)
        {
            List<Control> controls = new List<Control>();

            foreach (Control control in container.Controls)
            {
                controls.Add(control);
                if (control.HasChildren)
                    controls.AddRange(GetAllControls(control));
            }

            return controls;
        }


        private bool CheckCollision(PictureBox obj1, Label obj2)
        {
            Rectangle rect1 = new Rectangle(obj1.Left, obj1.Top, obj1.Width, obj1.Height);
            Rectangle rect2 = new Rectangle(obj2.Left, obj2.Top, obj2.Width, obj2.Height);
            return rect1.IntersectsWith(rect2);
        }


        private void CheckAllCollisions()
        {

            foreach (Label wall in walls)
            {
                if (CheckCollision(player, wall))
                {
                    ResetPacman();
                    return;
                }
            }

            foreach (Label obstacle in obstacles)
            {
                if (CheckCollision(player, obstacle))
                {
                    MessageBox.Show("Ха-ха,теперь начинай с начала!");
                    ResetPacman();
                    return;
                }
            }

            if (CheckCollision(player, finish))
            {
                MessageBox.Show("Победа!");
                ResetPacman();
            }
        }


        private void ResetPacman()
        {
            player.Location = start.Location;
        }


        private void Form1_KeyDown(object sender, KeyEventArgs e)
        {

            if (e.KeyCode == Keys.Up) player.Top -= speed;
            if (e.KeyCode == Keys.Down) player.Top += speed;
            if (e.KeyCode == Keys.Left) player.Left -= speed;
            if (e.KeyCode == Keys.Right) player.Left += speed;


            CheckAllCollisions();
        }

        //  курсор 
        private void wall_MouseEnter(object sender, EventArgs e)
        {
            Cursor.Position = start.PointToScreen(new Point(start.Width / 2, start.Height / 2));
        }

        private void panel_MouseEnter(object sender, EventArgs e)
        {
            Cursor.Position = start.PointToScreen(new Point(start.Width / 2, start.Height / 2));
        }

        private void finish_MouseEnter(object sender, EventArgs e)
        {
            MessageBox.Show("Победа!");
        }


        private void ob_MouseEnter(object sender, EventArgs e)
        {
            MessageBox.Show("Ха-ха,теперь начинай с начала!");
            Cursor.Position = start.PointToScreen(new Point(start.Width / 2, start.Height / 2));
        }
   
            private void teleport1_MouseEnter(object sender, EventArgs e)
        {
            Cursor.Position = teleport2.PointToScreen(new Point(teleport2.Width / 2, teleport2.Height / 2));
        }
        

        private void teleport2_MouseEnter(object sender, EventArgs e)
        {

        }
    }
}