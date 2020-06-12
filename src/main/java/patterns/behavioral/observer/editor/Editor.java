package patterns.behavioral.observer.editor;

import patterns.behavioral.observer.editor_manager.EditorManager;

public class Editor {
    private EditorManager editorManager;

    public Editor(EditorManager editorManager) {
        this.editorManager = editorManager;
    }

   public void doEditorAction(String event) {
        System.out.println("Editor has done " + event);
        editorManager.notifyAllSubscriber(event);

    }
}
