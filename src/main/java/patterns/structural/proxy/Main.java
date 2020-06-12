package patterns.structural.proxy;

import patterns.structural.proxy.elements.Proxy;
import patterns.structural.proxy.elements.ThirdPartyVideoLib;

public class Main {
    public static void main(String[] args) {

        ThirdPartyVideoLib proxy = new Proxy();
        proxy.loadVideo("zuul");
    }
}
