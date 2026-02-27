import java.util.Scanner;

public class Main2506621945 {
    // Banner pembuka, silakan manfaatkan variabel ini untuk menampilkan banner di awal dan di akhir program
    private static final String BANNER = ".______    __    __  .______       __    __       ___      .__   __.\r\n" + //
                                        "|   _  \\  |  |  |  | |   _  \\     |  |  |  |     /   \\     |  \\ |  |\r\n" + //
                                        "|  |_)  | |  |  |  | |  |_)  |    |  |__|  |    /  ^  \\    |   \\|  |\r\n" + //
                                        "|   _  <  |  |  |  | |      /     |   __   |   /  /_\\  \\   |  . `  |\r\n" + //
                                        "|  |_)  | |  `--'  | |  |\\  \\----.|  |  |  |  /  _____  \\  |  |\\   |\r\n" + //
                                        "|______/   \\______/  | _| `._____||__|  |__| /__/     \\__\\ |__| \\__|\r\n" + //
                                        "                                                                    \r\n" + //
                                        "  ______      __    __   _______     _______.___________.           \r\n" + //
                                        " /  __  \\    |  |  |  | |   ____|   /       |           |           \r\n" + //
                                        "|  |  |  |   |  |  |  | |  |__     |   (----`---|  |----`           \r\n" + //
                                        "|  |  |  |   |  |  |  | |   __|     \\   \\       |  |                \r\n" + //
                                        "|  `--'  '--.|  `--'  | |  |____.----)   |      |  |                \r\n" + //
                                        " \\_____\\_____\\\\______/  |_______|_______/       |__|                ";
    private static final String STUDENT_NAME = "Rania Yasin";
    private static final String STUDENT_ID = "2506621945";

    private static final int HARI_KE = 1;

    // Scanner untuk input, silakan manfaatkan variabel ini untuk mengambil input dari user
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // TODO: Tampilkan banner
        System.out.println(BANNER);
        System.out.println("Selamat datang di BurhanQuest!");
        System.out.println();

        // Hellow xixixi;
        boolean login = true;
        while (login) {
            System.out.println("=== Hari ke-" + HARI_KE + " ===");
            System.out.println("1. Login");
            System.out.println("2. Keluar dari program");
            System.out.print("Masukkan pilihan: ");
            String user_login = input.nextLine().trim();

            switch (user_login) {
                case "1":
                    // TODO: Menanyakan username dan password, lalu validasi.
                    System.out.print("Masukkan username: ");
                    String username = input.nextLine().trim();
                    System.out.print("Masukkan password: ");
                    String password = input.nextLine().trim();

                    // 1. Validasi username dan password
                    boolean loginSuccess = false;
                        if (username.equals("burhan") && password.equals("burunghantu123")) {
                            loginSuccess = true;
                            System.out.println("Login berhasil! Selamat datang, Admin.");
                            System.out.println();
    
                            // Setelah login admin berhasil, ke menu Admin
                            System.out.println("=== Menu Admin (Hari ke-" + HARI_KE + ") ===");
                            System.out.println("1. Lihat daftar quest");
                            System.out.println("2. Lihat daftar pengembara");
                            System.out.println("3. Tambah quest");
                            System.out.println("4. Tambah pengembara");
                            System.out.println("5. Filter daftar quest");
                            System.out.println("6. Filter daftar pengembara");
                            System.out.println("7. Tampilkan daftar quest terurut");
                            System.out.println("8. Tampilkan daftar pengembara terurut");
                            System.out.println("9. Lanjut ke hari berikutnya");
                            System.out.println("0. Keluar");
                            System.out.print("Masukkan pilihan: ");
                            String adminChoice = input.nextLine().trim();

                            switch (adminChoice) {
                                case "1":
                                    // TODO: Tampilkan daftar quest
                                    /* TODO: 1. Ambil data dari class Quest.java
                                             2. Ambil data dari method dalam class Quest.*/
                                    // TODO: panggil method getDisplayString() di class Quest.java, terus print string yang return dari method itu
                                    System.out.println("Belum diimplementasikan");
                                    break;

                                case "2":
                                    // TODO: Tampilkan daftar pengembara
                                    /* TODO: 1. Ambil data dari class Wanderer.java
                                             2. Ambil data dari method dalam class Wanderer.*/
                                    // TODO: panggil method getDisplayString() di class Wanderer.java, terus print string yang return dari method itu
                                    
                                    break;

                                case "3":
                                    // TODO: Tambah quest
                                     /* TODO: 1. Ambil data dari class Quest.java
                                              2. Ambil data dari method dalam class Quest.*/
                                    String questName, questDescription, questDifficulty;
                                    int questReward, questExp, questDuration;
                                    boolean validInput = false;

                                    while (!validInput) {
                                    System.out.print("Masukkan nama quest: ");
                                    questName = input.nextLine().trim();
                                    System.out.print("Masukkan deskripsi quest: ");
                                    questDescription = input.nextLine().trim();
                                    System.out.print("Masukkan reward quest berupa bil. bulat nonnegatif: ");
                                    questReward = input.nextInt();
                                    System.out.print("Masukkan bonus exp quest berupa bil. bulat nonnegatif: ");
                                    questExp = input.nextInt();
                                    input.nextLine();
                                    System.out.print("Masukkan tingkat kesulitan quest (opsi: mudah, menegah, sulit): ");
                                    questDifficulty = input.nextLine().trim();
                                    System.out.print("Masukkan durasi quest: ");
                                    questDuration = input.nextInt();
                                    }
                                    /* 1. nanti hasil inputan diproses untuk ditambahkan ke list 
                                        quest yang sudah dibuat sebelumnya di class Quest.java di methodnya
                                       2. nanti dapet return string, kalau valid maka berhasil, kalau udah ada maka ga valid*/
                                    break;

                                case "4":
                                    // TODO: Tambah pengembara
                                    String wandererName, wandererUsername, wandererPassword;
                                    boolean validWandererInput = false;

                                    while (!validWandererInput) {
                                    System.out.println("Masukkan nama pengembara: ");
                                    wandererName = input.nextLine().trim();
                                    System.out.println("Masukkan username pengembara: ");
                                    wandererUsername = input.nextLine().trim();
                                    System.out.println("Masukkan password pengembara: ");
                                    wandererPassword = input.nextLine().trim();
                                    }
                                    /* TODO: 1. nanti hasil inputan diproses untuk ditambahkan ke list 
                                                pengembara yang sudah dibuat sebelumnya di class Wanderer.java di methodnya
                                       TODO: 2. nanti dapet return string, kalau valid maka berhasil, kalau udah ada maka ga valid*/

                                    break;

                                case "5":
                                    // TODO: Filter daftar quest
                                    /* TODO: 1. Ambil data dari class Quest.java
                                             2. Ambil data dari method dalam class Quest.*/
                                    System.out.println("Filter daftar quest");
                                    System.out.println("1. Filter berdasarkan status");
                                    System.out.println("2. Filter berdasarkan tingkat kesulitan (opsi: mudah, menegah, sulit)");
                                    System.out.print("X. Kembali ke menu utama");
                                    System.out.print("Masukkan tipe filter: ");
                                    System.out.println("Masukkan status quest yang ingin difilter (tersedia/diambil/selesai) masukkan 'x' atau 'X' untuk kembali ke menu utama: ");
                                    // TODO: nanti hasil inputan diproses untuk memfilter list quest yang sudah dibuat sebelumnya di class Quest.java di methodnya
                                    // TODO: nanti dapet return string dari method filter quest berupa string yang menampilkan daftar quest terfilter
                                    break;

                                case "6":
                                    // TODO: Filter daftar pengembara
                                    /* TODO: 1. Ambil data dari class Wanderer.java
                                             2. Ambil data dari method dalam class Wanderer.*/
                                    // TODO: kalau input tidak valid, tampilkan pesan error, terus ulang lagi sampai input valid sambil looping case 6 ini
                                    // TODO: bikin scanner input untuk case 6 enih yeah bruh, cape kata baku trus buy
                                    System.out.println("Filter daftar pengembara");
                                    System.out.println("1. Filter berdasarkan status");
                                    System.out.println("2. Filter berdasarkan rentang level");
                                    System.out.print("X. Kembali ke menu utama");
                                    System.out.print("Masukkan tipe filter: ");
                                    System.out.println("Masukkan rentang level (inklusif) pengembara yang ingin difilter, masukkan 'x' atau 'X' untuk kembali ke menu utama: ");
                                    System.out.println("Masukkan batas bawah: ");
                                    System.out.println("Masukkan batas atas: ");
                                    // TODO: nanti hasil inputan diproses untuk memfilter list pengembara yang sudah dibuat sebelumnya di class Wanderer.java di methodnya
                                    // TODO: nanti dapet return string dari method filter pengembara berupa string yang menampilkan daftar pengembara terfilter
                                    break;

                                case "7":
                                    // TODO: Tampilkan daftar quest terurut
                                    /* TODO: 1. Ambil data dari class Quest.java
                                             2. Ambil data dari method dalam class Quest.*/
                                    
                                    System.out.println("Urutkan daftar quest");
                                    System.out.println("1. Berdasarkan tingkat kesulitan");
                                    System.out.println("2. Berdasarkan reward");
                                    System.out.println("X. Kembali ke menu utama");
                                    System.out.print("Masukkan input: ");
                                    System.out.println("Masukkan order urutan (asc/desc), masukkan 'x' atau 'X' untuk kembali ke menu utama: ");
                                    // TODO: nanti hasil inputan diproses untuk mengurutkan list quest yang sudah dibuat sebelumnya di class Quest.java di methodnya
                                    // TODO: nanti dapet return string dari method urut quest berupa string yang menampilkan daftar quest terurut based on input user
                                    break;

                                case "8":
                                    // TODO: Filter daftar pengembara terurut
                                    /* TODO: 1. Ambil data dari class Wanderer.java
                                                2. Ambil data dari method dalam class Wanderer.*/
                                    // looping untuk setelah selesai ke menu admin
                                    System.out.println("Urutkan daftar pengembara");
                                    System.out.println("1. Berdasarkan nama");
                                    System.out.println("2. Berdasarkan level");
                                    System.out.println("X. Kembali ke menu utama");
                                    System.out.print("Masukkan input: ");
                                    System.out.println("Masukkan order urutan (asc/desc), masukkan 'x' atau 'X' untuk kembali ke menu utama: ");
                                    // TODO: nanti hasil inputan diproses untuk mengurutkan list pengembara yang sudah dibuat sebelumnya di class Wanderer.java di methodnya
                                    // TODO: nanti dapet return string dari method urut pengembara berupa string yang menampilkan daftar pengembara terurut based on input user
                                    break;

                                case "9":
                                    // TODO: Lanjut ke hari berikutnya
                                    /* TODO: 1. Ambil data dari class Quest.java
                                             2. Ambil data dari method dalam class Quest.*/
                                    System.out.println("Belum diimplementasikan");
                                    break;

                                case "0":
                                    // TODO: Keluar
                                    System.out.println("Logout berhasil.");
                                    System.out.println();
                                    break;

                                default:
                                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                    break;
                            } // End of menu admin
                        } // End of login admin


                        // Kalau login username pengembara, masuk ke menu pengembara
                        boolean validateWandererLogin = Wanderer.authenticate(username, password);
                        if (validateWandererLogin) {
                            // TODO: Pakai method authenticate(String username, String password)
                            System.out.println("Login berhasil! Selamat datang, " + username + ".");
                            System.out.println();
                            loginSuccess = true;
                            // Setelah login pengembara berhasil, ke menu Pengembara, ini return stringnya dari method authenticate di class Wanderer.java

                            // TODO: while loop untuk menu pengembara, kalau pilih keluar, keluar dari menu pengembara, balik ke menu login

                            boolean inWandererMenu = true;
                            while (inWandererMenu) {
                                /* while loop untuk menu pengembara supaya bisa balik ke menu pengembara setelah selesai lihat data diri, 
                                   lihat daftar quest, filter daftar quest, dll. Kecuali kalau pilih keluar,
                                   baru keluar dari menu pengembara. Jadi nanti kalau udah login sebagai pengembara, 
                                   bisa terus explore menu pengembara sampai pilih keluar.*/
                                System.out.println("=== Menu Pengembara (Hari ke-" + HARI_KE + ") ===");
                                System.out.println("1. Lihat data diri");
                                System.out.println("2. Lihat daftar quest");
                                System.out.println("3. Filter daftar quest");
                                System.out.println("4. Tampilkan daftar quest terurut");
                                System.out.println("5. Ambil quest");
                                System.out.println("0. Keluar");
                                System.out.print("Masukkan pilihan: ");
                                String wandererChoice = input.nextLine().trim();

                                switch (wandererChoice) {
                                    case "1":
                                        // TODO: Lihat data diri
                                        /* TODO: gatau ini mau ke mana lol*/
                                        String wandererID = "", wandererName = "", wandererUsername = "", wandererStatus = "";
                                        int wandererLevel = 1, wandererExp = 0, wandererCoins = 0;

                                        System.out.println("=== Data Diri Pengembara ===");
                                        System.out.println("ID Pengembara: " + wandererID);
                                        System.out.println("Nama Pengembara: " + wandererName);
                                        System.out.println("Username Pengembara: " + wandererUsername);
                                        System.out.println("Level Pengembara: " + wandererLevel);
                                        System.out.println("Exp Pengembara: " + wandererExp);
                                        System.out.println("Koin Didapatkan: " + wandererCoins);
                                        System.out.println("Status Pengembara: " + wandererStatus);
                                        break;

                                    case "2":
                                        // TODO: Lihat daftar quest
                                        /* TODO: 1. Ambil data dari class Wanderer.java
                                                2. Ambil data dari method dalam class Wanderer.*/
                                        System.out.println("Belum diimplementasikan");
                                        break;

                                    case "3":
                                        // TODO: Filter daftar quest
                                        /* TODO: 1. Ambil data dari class Quest.java
                                                2. Ambil data dari method dalam class Quest.*/
                                        System.out.println("Belum diimplementasikan");
                                        break;

                                    case "4":
                                        // TODO: Tampilkan daftar quest terurut
                                        System.out.println("Belum diimplementasikan");
                                        break;

                                    case "5":
                                        // TODO: Ambil quest
                                        /* TODO: 1. Ambil data dari class Quest.java
                                                2. Ambil data dari method dalam class Quest.*/
                                        System.out.println("Belum diimplementasikan");
                                        break;

                                    case "0":
                                        // TODO: Keluar
                                        System.out.println("Logout berhasil.");
                                        System.out.println();
                                        break;

                                } // End of choices menu pengembara
                            } // End of while loop menu pengembara

                        } else { // Kalau LOGIN GAGAL, tampilkan pesan ERROR
                                System.out.println("Username atau password salah.");
                        }
                    break;
                case "2":
                    System.out.println();
                    System.out.println("Terima kasih telah menggunakan BurhanQuest!");
                    System.out.println("Dibuat oleh: " + STUDENT_NAME + " - " + STUDENT_ID);
                    System.out.println(BANNER);
                    login = false;
                    break;
                default: // Kalau input pilihan login tidak valid, tampilkan pesan ERROR
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            } // End of switch choices menu login
        } // End of while loop menu login


        // Wanderer(String idNumber, String name, String username, String password) 
            /* INI mau manggil method dari kelas lain di file lain. */




        // 1. Harus bikin list buat simpen username
        // 2. Harus bikin list buat simpen password
            // Membuat method buat validasi login, yang ngecek username dan password yang diinput user sama dengan yang ada di list atau engga


        // Membuat method Quest, Pengembara, GameManager

    }
}
