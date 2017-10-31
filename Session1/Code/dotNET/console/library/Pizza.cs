namespace library
{
    public class Pizza
    {
        protected string crust;

        int diameter;

        bool inStock = true;

        public int Diameter 
        {
            get => diameter;
            set => diameter = value;
        }

        public bool InStock
        {
            get => inStock;
        }

       public Pizza(string whatCrust)
       {
           crust = whatCrust;
       }

       public string PizzaCrust()
       {
           return crust;
       }

       public double PizzaArea()
       {
           return  (3.14/4) * (diameter*diameter);
       }

       public virtual void PizzaIsOutofStock()
       {
           inStock = false;
       }
    }
}