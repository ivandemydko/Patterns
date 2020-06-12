package patterns.behavioral.observer;

import patterns.behavioral.observer.editor.Editor;
import patterns.behavioral.observer.editor_manager.EditorManager;
import patterns.behavioral.observer.subscriber.Subscriber;
import patterns.behavioral.observer.subscriber.SubscriberA;
import patterns.behavioral.observer.subscriber.SubscriberB;

public class Main {
    public static void main(String[] args) {
        Subscriber subscriberA = new SubscriberA();
        Subscriber subscriberB = new SubscriberB();

        EditorManager editorManager = new EditorManager("operationA", "operationB");
        editorManager.subscribe("operationA",subscriberA);
        editorManager.subscribe("operationB",subscriberB);

        Editor editor = new Editor(editorManager);

        editor.doEditorAction("operationA");
        System.out.println("---------------------------------------------------------------------------");
        editor.doEditorAction("operationB");
    }
}
