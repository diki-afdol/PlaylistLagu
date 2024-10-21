public class PlaylistLagu {
    public static void PlaylistLagu(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong("Song A");
        playlist.addSong("Song B");
        playlist.addSong("Song C");

        playlist.displayPlaylist();
    }
}
