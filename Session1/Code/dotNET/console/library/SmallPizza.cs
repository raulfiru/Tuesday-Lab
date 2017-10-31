namespace library
{
    public class SmallPizza : Pizza
    {
        string owner;

        public SmallPizza(string whatCrust) : base(whatCrust)
       {   
           this.Diameter = 11;
       }

        public string Owner
        {
            get => owner;
        }
        public void SendtoCustomer(string customer){
            owner = customer;
        }

        public override void PizzaIsOutofStock()
        {
           throw new System.Exception();
        }
    }
}