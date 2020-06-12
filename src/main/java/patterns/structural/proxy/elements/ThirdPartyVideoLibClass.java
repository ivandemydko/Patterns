package patterns.structural.proxy.elements;

public class ThirdPartyVideoLibClass implements ThirdPartyVideoLib {

    @Override
    public void loadVideo(String videoId) {
        System.out.println("Find and load video: " + videoId + " from net");
    }
}
