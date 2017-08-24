/* În cadrul aplicației noastre web am obținut următorul string care transmite parametri în următoru format:

serverId=25&serverName=my name&serverStatus=Running

Creați o clasă Server cu următoarele câmpuri: Id, Name and Status.
Creați o enumerare cu statusurile serverului (Stopped, Running, Unknown)
și o metodă care izolează parametrii (din probleme) și creează o instanță a clasei Server pe baza lor.
Trebuie suprascrisă metoda toString a clasei Server și afișat ID-ul, numele și statusul serverului în ea.  */
public class Server
{
    public enum ServerStatus {Stopped, Running, Unknown}
    public int id;
    public String name;
    public ServerStatus status;
    public Server() {}
    public Server (String pars)
    {
        String[] parsArray = pars.split("&");
        this.id = Integer.parseInt(parsArray[0].split("=")[1]);
        this.name = parsArray[1].split("=")[1].toString();
        this.status = getStatus(parsArray[2].split("=")[1].toString());
    }
    public ServerStatus getStatus(String status)
        {
            ServerStatus res = ServerStatus.Unknown;
                   try
                   {res = ServerStatus.valueOf(status);}
                   catch (Exception e) {}
                   return res;
        }
        @Override
        public String toString ()
        {
            return "Server id: "+this.id+"\nServer name: "+this.name+"\nSever status: "+this.status+"\n";
        }
    public static void main (String[]args)
    {
        Server s = new Server("serverid=25&serverName=my name&serverStatus=Stopped");
        System.out.println(s);
    }
}
