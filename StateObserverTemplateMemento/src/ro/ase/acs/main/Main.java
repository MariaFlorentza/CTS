package ro.ase.acs.main;

import ro.ase.acs.memento.VideoEditor;
import ro.ase.acs.observer.YoutubeChannel;
import ro.ase.acs.observer.YoutubeSubscriber;
import ro.ase.acs.state.VendingMachine;
import ro.ase.acs.template.PartMover;
import ro.ase.acs.template.RoboticArm;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.inputMoney(15);
        vendingMachine.selectProduct(10);

        YoutubeChannel youtubeChannel = new YoutubeChannel("TestACS");
        YoutubeSubscriber youtubeSubscriber1 = new YoutubeSubscriber();
        YoutubeSubscriber youtubeSubscriber2 = new YoutubeSubscriber();
        youtubeChannel.subscribe(youtubeSubscriber1);
        youtubeChannel.subscribe(youtubeSubscriber2);
        youtubeChannel.publishVideo();
        youtubeChannel.unsubscribe(youtubeSubscriber1);
        youtubeChannel.publishVideo();

        VideoEditor videoEditor = new VideoEditor();
        videoEditor.edit(5);
        videoEditor.ctrlS();
        videoEditor.edit(7);
        videoEditor.ctrlS();
        videoEditor.edit(2);
        System.out.println(videoEditor);
        videoEditor.ctrlZ();
        System.out.println(videoEditor);

        PartMover partMover = new RoboticArm();
        partMover.movePart();
    }
}
