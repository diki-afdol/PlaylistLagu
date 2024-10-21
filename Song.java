// Kelas Song
class Song {
    String title;
    Song next;

    // Konstruktor untuk Song
    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}

// Kelas Playlist
class Playlist {
    private Song head; // Pointer ke lagu pertama dalam playlist

    // Metode untuk menambah lagu di akhir playlist
    public void addSong(String title) {
        Song newSong = new Song(title);

        // Jika playlist kosong, set sebagai lagu pertama
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }

    // Metode untuk menampilkan semua lagu dalam playlist
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist kosong.");
            return;
        }

        Song current = head;
        System.out.println("Daftar Lagu dalam Playlist:");
        while (current != null) {
            System.out.println(current.title);
            current = current.next;
        }
    }
}

