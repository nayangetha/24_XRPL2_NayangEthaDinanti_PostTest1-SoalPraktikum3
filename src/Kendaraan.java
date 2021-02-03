
//fungsi scanner untuk menginputkan dari user
import java.util.Scanner;

public class Kendaraan {
   
    //method static
    static void input(){
    
    //Inisialisasi objek input dari class scanner    
    Scanner input = new Scanner(System.in);
    
    //Deklarasi variable String
    String  nregistrasi, pemilik, alamat, merk, type, jenis, model, pembuatan,  
            silinder , rangka, mesin, warna, bakar, tnkb, bpkb, 
            lokasi;
    //Deklarasi Variable Double
    Double treg, berlaku;
    
    
        //Input data oleh user
        System.out.println("Lengkapi Data Dibawah Ini!");
        System.out.println("");
        
        System.out.print("Nomor Registrasi  : ");
        nregistrasi = input.nextLine();
        
        System.out.print("Nama Pemilik      : ");
        pemilik = input.nextLine();
        
        System.out.print("Alamat            : ");
        alamat = input.nextLine();
        
        System.out.print("Merk              : ");
        merk = input.nextLine();
        
        System.out.print("Type              : ");
        type = input.nextLine();
        
        System.out.print("Jenis             : ");
        jenis = input.nextLine();
        
        System.out.print("Model             : ");
        model = input.nextLine();
        
        System.out.print("Tahun Pembuatan   : ");
        pembuatan = input.nextLine();
        
        System.out.print("Isi Silinder      : ");
        silinder = input.nextLine();
        
        System.out.print("Nomor Rangka      : ");
        rangka = input.nextLine();
        
        System.out.print("Nomor Mesin       : ");
        mesin = input.nextLine();
        
        System.out.print("Warna             : ");
        warna = input.nextLine();
        
        System.out.print("Bahan Bakar       : ");
        bakar = input.nextLine();
        
        System.out.print("Warna TNKB        : ");
        tnkb = input.nextLine();
        
        System.out.print("Nomor BPKB        : ");
        bpkb = input.nextLine();
        
        System.out.print("Kode Lokasi       : ");
        lokasi = input.nextLine();
        
        System.out.print("Tahun Registrasi  : ");
        treg = input.nextDouble();
        
        System.out.println("Nomor Pendaftaran : "+treg+nregistrasi);
        
        //perhitungan limit yaitu 10 tahun setelah registrasi
        berlaku = treg+10;
        System.out.println("Berlaku Sampai    : "+berlaku);
        
        System.out.println("");
        System.out.println("KAMI SEDANG MEMPROSES DATA ANDA, SILAHKAN TUNGGU!");
        System.out.println("");
    
        //pemanggilan data yang telah di input user
        System.out.println("____________________________________________________");
        System.out.println("");
        System.out.println("        KEPOLISIAN NEGARA REPUBLIK INDONESIA        ");
        System.out.println("                      DAERAH                        ");
        System.out.println("                    METRO JAYA                      ");
        System.out.println("____________________________________________________");
        System.out.println("");
        System.out.println("        SURAT TANDA NOMOR KENDARAAN BERMOTOR        ");
        System.out.println("");
        System.out.println("NOMOR REGISTRASI    = "+nregistrasi);
        System.out.println("NAMA PEMILIK        = "+pemilik);
        System.out.println("ALAMAT              = "+alamat);
        System.out.println("MERK                = "+merk);
        System.out.println("TYPE                = "+type);
        System.out.println("JENIS               = "+jenis);
        System.out.println("MODEL               = "+model);
        System.out.println("TAHUN PEMBUATAN     = "+pembuatan);
        System.out.println("ISI SILINDER        = "+silinder);
        System.out.println("NOMOR RANGKA        = "+rangka);
        System.out.println("NOMOR MESIN         = "+mesin);
        System.out.println("WARNA               = "+warna);
        System.out.println("BAHAN BAKAR         = "+bakar);
        System.out.println("WARNA TNKB          = "+tnkb);
        System.out.println("TAHUN REGISTRASI    = "+treg);
        System.out.println("NOMOR BPKB          = "+bpkb);
        System.out.println("KODE LOKASI         = "+lokasi);
        System.out.println("NO URUT PENDAFTARAN = "+treg+nregistrasi);
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("               BERLAKU SAMPAI "+berlaku);
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");

}
    }