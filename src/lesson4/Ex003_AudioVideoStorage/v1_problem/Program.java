package lesson4.Ex003_AudioVideoStorage.v1_problem;

public class Program {
    public static void main(String[] args) {

        Repository audioStorage = new Repository();
        audioStorage.addToRepository(new AudioContent("track001.mp3"));
        audioStorage.addToRepository(new AudioContent("new_song.wav"));

        Repository videoStorage = new Repository();
        videoStorage.addToRepository(new VideoContent("Terminator.mpeg4"));
        videoStorage.addToRepository(new VideoContent("New_film.mp4"));

        // region ПРОБЛЕМА - в видеорепозиторий можем добавить аудиоконтент и наоборот.
        audioStorage.addToRepository(new VideoContent("Batman.mp4"));
        videoStorage.addToRepository(new AudioContent("cool_track.mp3"));
        // endregion
    }
}
