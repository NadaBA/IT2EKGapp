import javafx.event.ActionEvent;
import javafx.scene.shape.Polyline;

public class EkgGUIController {


    public Polyline polyline;

    public void buttonPressed(ActionEvent actionEvent) throws InterruptedException {
        System.out.println("Du har trykket på knappen");
        //Alt det her tager noget tid, det får sin egen tråd!
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i <10; i++) {
                    polyline.getPoints().
                            addAll(i * 10.0, Math.random() * 100);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


        }
    }

