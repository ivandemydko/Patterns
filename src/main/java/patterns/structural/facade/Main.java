package patterns.structural.facade;

import patterns.structural.facade.video_facade.VideoFacade;

public class Main {
    public static void main(String[] args) {
        VideoFacade facade = new VideoFacade();
        facade.doVideoLogic();
    }
}
