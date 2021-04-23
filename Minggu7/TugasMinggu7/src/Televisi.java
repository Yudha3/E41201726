/**
 *
 * @author AYP
 */
public class Televisi {
    private String deskripsi;
    private int jumlahChannel;
    private String[] channel = null;
    private int channelAktif;
    private int volume;
    
    public Televisi(String deskripsi, int jumlahChannel){
        this.deskripsi = deskripsi;
        this.jumlahChannel = jumlahChannel;
    }
    
    public String getDeskripsi(){
        return deskripsi;
    }
    
    public int getJumlahChannel(){
        return jumlahChannel;
    }
    
    public String[] getChannel(){
        if(channel == null){
            System.out.println("Belum ada channel yang di set!");
        }
        return channel;
    }
    
    public void setChannel(String[] channel){
        if(channel.length > jumlahChannel){
            System.out.println("Maaf TV ini hanya dapat menyimpan " + jumlahChannel + " channel");
        } else{
            this.channel = channel;
            System.out.println("Informasi channel berhasil di update!");
        }
    }
    
    public int getChannelAktif(){
        return channelAktif;
    }
    
    public void setChannelAktif(int channelAktif){
        if(channelAktif > channel.length){
            System.out.println("Channel yang anda inginkan belum di set!");
            return;
        }
        this.channelAktif = channelAktif;
        System.out.println("Pindah channel ke : " + channel[channelAktif]);
    }
    
    public int getVolume(){
        return volume;
    }
    
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("intensitas volume sekarang : " + volume);
    }
}

class User{
    public static void main(String[] args){
        Televisi tv = new Televisi("TV tempoe doeloe, 14 inches", 10);
        String[] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV", 
                                 "METRO TV", "TRANS TV", "TPI", "TV 7",
                                  "TVRI", "TV G", "ANTV"};
        String[] channelFavorit = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
                                    "METRO TV", "TRANS TV", "TPI", "TV 7"};
        System.out.println("Pak Lukman membeli televisi : " + tv.getDeskripsi());
        tv.getChannel();
        tv.setChannel(semuaChannel);
        tv.setChannel(channelFavorit);
        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
    }
}
