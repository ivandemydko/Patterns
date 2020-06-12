package patterns.structural.proxy.elements;

public class Proxy implements ThirdPartyVideoLib {

    private ThirdPartyVideoLib thirdPartyVideoLib = new ThirdPartyVideoLibClass();

    @Override
    public void loadVideo(String videoId) {
        System.out.println("Proxy logic( if(!cash.isEmpty){load " + videoId + " from cash...etc.}\n else");
        thirdPartyVideoLib.loadVideo(videoId);
    }
}
