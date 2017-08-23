/* Pentru aplicaţia unui restaurant de fast food, trebuie creată clasa abstractă Produs.
Această clasă conţine proprietăţi publice: int tipProdus, String nume şi double preţul de bază,
precum şi un şir de stringuri adaosuri, care poate conţine cel mult 10 adaosuri.
De asemenea, această clasă conţine şi metoda introducere adaos care introduce adaosul pentru produs
(salată, condimente etc.) şi metoda toateAdaosurile, care returnează toate adaosurile sub formă de
 string. Clasa trebuie să aibă şi o metodă abstractă, calcularePreţ, care va calcula preţul pe baza
 tipului de produs. În timpul calculării preţului produsului, trebuie să aveţi grijă la taxa pentru
 pizza de 10%, în timp ce taxa pentru sendvişuri este de 15%. Clasa trebuie să posede şi metoda
 suprascrisă toString care va afişa datele despre produs în următoarea formă: Produs: pizza,
 preţ: 25,45, adaosuri: roşii, muştar, maioneză. Trebuie create clasele Pizza şi Sendviş care
 moştenesc clasa Produs şi trebuie creat codul pentru crearea unei instanţe a claselor Pizza şi
 Sendviş în metoda Main. Clasele Pizza şi Sendviş necesită în constructor numele şi preţul  produsului.
 */

public abstract class Product
{
    public int type;
    public String name;
    public double price;
    public String[] additions;
    public abstract double countPrice();

    @Override
    public String toString()
    {
        StringBuilder output  = new StringBuilder();
        output.append("Produs: ");
        output.append(this.name + ", ");
        output.append("pret: " + countPrice() + ", ");
        output.append("adaosuri: " + allAdditions());
        return output.toString();
    }
        public String allAdditions()
        {
            StringBuilder output = new StringBuilder();
            for(int i=0;i<this.additions.length;i++)
                if(this.additions[i]!=null)
                    output.append(this.additions[i] + ", ");
            if(!output.toString().equals(""))
            {
                if(output.toString().trim().endsWith(","))
                    output.replace(output.length()-2, output.length(), "");
            }    else
                output.append("fara adaosuri");
            return output.toString();
        }
    public void addition(String addition)
    {
        for(int i=0;i<this.additions.length;i++)
            if(this.additions[i]==null)
            {
                this.additions[i]=addition;
                break;
            }
    }
    public static void main(String[] args)
    {
        Pizza p = new Pizza("Capriciossa",25);
        p.addition("rosii");
        p.addition("smantana");
        Sandwich s = new Sandwich("Sendvis cu sunca", 35);
        p.addition("castravete");
        p.addition("ceapa");
        p.addition("rosii");

        System.out.println(p);
        System.out.println(s);
    }
}
