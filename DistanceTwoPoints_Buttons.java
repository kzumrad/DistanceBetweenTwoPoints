import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.*;

public class DistanceTwoPoints_Buttons {

    // Define a button handler
    public static class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            Double Lat1 = Double.parseDouble(latField1.getText());
            Double Lon1 = Double.parseDouble(lonField1.getText());
            Double Lat2 = Double.parseDouble(latField2.getText());
            Double Lon2 = Double.parseDouble(lonField2.getText());
            Location loc1 = new Location(Lat1,Lon1);
            Location loc2 = new Location(Lat2,Lon2);
            Distance twoLoc = new Distance(loc1,loc2);
            dist = twoLoc.CalcDist();
            dist = dist/1000.0; // distance in km
            outputDist.setText("The distance between the two locations is " + dist);
        }
    }

    // Defining the objects that are shared by main and button handler
    private static Frame outputFrame;
    private static Label Latitude1;
    private static TextField latField1;
    private static Label Latitude2;
    private static TextField latField2;
    private static Label Longitude1;
    private static TextField lonField1;
    private static Label Longitude2;
    private static TextField lonField2;
    private static Double dist;
    private static Label outputDist;

    public static void main (String[] args)
    {
        Button calculate = new Button("Calculate Distance");
        ButtonHandler calculateDistance = new ButtonHandler();
        outputDist = new Label();
        // instantiating the shared objects
        outputFrame = new Frame();
        Latitude1 = new Label("Latitude 1");
        Longitude1 = new Label("Longitude 1");
        Latitude2 = new Label("Latitude 2");
        Longitude2 = new Label("Longitude 2");
        latField1 = new TextField("",6);
        lonField1 = new TextField("", 6);
        latField2 = new TextField("",6);
        lonField2 = new TextField("",6);
        outputFrame.setLayout(new GridLayout(3, 4));

        // naming the event and registering the listener
        calculate.setActionCommand("calculate");
        calculate.addActionListener(calculateDistance);

        // adding the elements of the user interface to the frame
        outputFrame.add(Latitude1);
        outputFrame.add(latField1);
        outputFrame.add(Longitude1);
        outputFrame.add(lonField1);
        outputFrame.add(Latitude2);
        outputFrame.add(latField2);
        outputFrame.add(Longitude2);
        outputFrame.add(lonField2);
        outputFrame.add(calculate);
        outputFrame.add(outputDist);
        outputFrame.pack();
        outputFrame.show();

        // closing the window
        outputFrame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent event)
            {
                outputFrame.dispose();
                System.exit(0);
            }
        });



    }

}
