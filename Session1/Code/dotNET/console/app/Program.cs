using System;
using library;

namespace app
{
    class Program
    {
        static void Main(string[] args)
        {
            Pizza newPizza = new Pizza("crunchy");

            // newPizza.Crust = "crunchy";

            newPizza.Diameter = 12;

            Console.WriteLine(newPizza.PizzaArea());

            Console.WriteLine(newPizza.InStock);
            newPizza.PizzaIsOutofStock();
            Console.WriteLine(newPizza.InStock);

            // SmallPizza sp  = new SmallPizza("soft");
            Pizza sp  = new SmallPizza("soft");
            Console.WriteLine(sp.PizzaArea());

            sp.PizzaIsOutofStock();
            Console.WriteLine(sp.InStock);

            //Console.WriteLine("Hello World! "+Calculator.Add(5,6));
        }
    }
}
