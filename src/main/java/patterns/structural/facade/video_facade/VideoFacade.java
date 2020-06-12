package patterns.structural.facade.video_facade;

import patterns.structural.facade.video_library.AudioCodec;
import patterns.structural.facade.video_library.VideoCodec;
import patterns.structural.facade.video_library.VideoFormat;

public class VideoFacade {

    public void doVideoLogic() {
        VideoFormat videoFormat = new VideoFormat();
        VideoCodec videoCodec = new VideoCodec();
        AudioCodec audioCodec = new AudioCodec();

        videoFormat.setVideoFormat("4k");
        videoCodec.doSomething();
        audioCodec.doSomething();
    }
}
