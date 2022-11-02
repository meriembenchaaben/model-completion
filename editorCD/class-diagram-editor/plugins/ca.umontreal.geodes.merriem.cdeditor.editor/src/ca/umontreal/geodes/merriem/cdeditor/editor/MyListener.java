package ca.umontreal.geodes.merriem.cdeditor.editor;

import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;



class MyListener extends ResourceSetListenerImpl {
    public void resourceSetChanged(ResourceSetChangeEvent event) {
            System.out.println("Domain " + event.getEditingDomain().getID() +
             " changed " + event.getNotifications().size() + " times");
            System.out.println("pleaaaaase");

    }
}