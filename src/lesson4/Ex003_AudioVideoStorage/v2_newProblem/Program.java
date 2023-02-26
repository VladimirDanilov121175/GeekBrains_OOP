package lesson4.Ex003_AudioVideoStorage.v2_newProblem;

public class Program {
    public static void main(String[] args) {

        Repository<AudioContent> audioStorage = new Repository<>();
        audioStorage.addToRepository(new AudioContent("track001.mp3"));
        audioStorage.addToRepository(new AudioContent("new_song.wav"));

        Repository<VideoContent> videoStorage = new Repository<>();
        videoStorage.addToRepository(new VideoContent("Terminator.mpeg4"));
        videoStorage.addToRepository(new VideoContent("New_film.mp4"));

        // region проблема версии v1 решена, мы не можем добавлять в видеохранилище аудиофайлы и наоборот
//        audioStorage.addToRepository(new VideoContent("Batman.mp4"));
//        videoStorage.addToRepository(new AudioContent("cool_track.mp3"));
        // endregion

        // region Новая проблема - можно создавать репозитории любого типа, когда задача - хранить только медиа
        Repository<String> stringRepository = new Repository<>();
        stringRepository.addToRepository("someText");
        // endregion
    }
}
