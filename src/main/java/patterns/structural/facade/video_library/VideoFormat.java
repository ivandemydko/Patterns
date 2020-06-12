package patterns.structural.facade.video_library;

public class VideoFormat {

    public void setVideoFormat(String videoFormat) {
        switch (videoFormat) {
            case "mp4":
                System.out.println("mp4 format");
                break;
            case "hd":
                System.out.println("hd format");
                break;
            default:
                System.out.println("4k format");
        }
    }

}
