import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
public class cardrive {
		public static void main(String []args){
		//	JPanel panel =new JPanel();
		//	JLabel colorLbl = new JLabel("enter color");
		//	JLabel horsePowerLbl = new JLabel("enter Horse Power");
		//	JLabel engineSizeLbl = new JLabel("enter Engine Size");
		//	JLabel makeLbl = new JLabel("enter Engine make");
		//	JTextField colorTxt = new JTextField("type color");
		//	JTextField horsePowerTxt = new JTextField("type Horse Power");
		//	JTextField engSizeTxt = new JTextField("type Engsine Size");
		//	JTextField makeTxt = new JTextField("type make");
		//	JButton button=new JButton("Submit");
			
		//	panel.add(colorLbl);
		//	panel.add(colorTxt);
		//	panel.add(horsePowerLbl);
		//	panel.add(horsePowerTxt);
		//	panel.add(engineSizeLbl);
		//	panel.add(engSizeTxt);
		//	panel.add(makeLbl);
		//	panel.add(makeTxt);
		//	panel.add(button);
			
		//	JOptionPane.showMessageDialog(null,panel, "car information", JOptionPane.INFORMATION_MESSAGE);
			System.out.println("number of car(s):"+car.getCount());
			
			 String color =JOptionPane.showInputDialog(null,"enter color of the car");
			int horsePower =Integer .parseInt(JOptionPane.showInputDialog(null,"enter horsePower of the car"));
			double engineSize =Double.parseDouble(JOptionPane.showInputDialog(null,"enter EngineSize of the car"));
			String make =JOptionPane.showInputDialog(null,"enter make of the car");
			
			car car1 = new car(color,horsePower,engineSize,make);
			car car2 = new car("black",459, 4.0,"Somepeople");
			car car3 = new car("red",222, 1.5,"herself");
			System.out.println(car1);
			System.out.println(car2);
			System.out.println(car3);
			System.out.println("is car1 same as the car 2 "+ car1.equals(car2));
			System.out.println("is car1 same as the car 3 "+ car1.equals(car3));
			System.out.println("is car2 same as the car 3 "+ car2.equals(car3));
			car1.setColor("blue");car1.setEngineSize(4.0);car1.setHorsePower(400);car1.setMake("toyota");
			car2.setColor("blue");car2.setEngineSize(4.0);car2.setHorsePower(400);car2.setMake("toyota");
			car3.setColor("blue");car3.setEngineSize(4.0);car3.setHorsePower(400);car3.setMake("toyota");
			System.out.println(car1.getColor()+" "+ car1.getHorsePower()+" "+ car1.getEngineSize()+" "+car1.getMake());
			System.out.println(car2.getColor()+" "+ car2.getHorsePower()+" "+ car2.getEngineSize()+" "+car2.getMake());
			System.out.println(car3.getColor()+" "+ car3.getHorsePower()+" "+ car3.getEngineSize()+" "+car3.getMake());
			System.out.println("number of car(s):"+car.getCount());
			System.out.println("is car1 same as the car 2 "+ car1.equals(car2));
			System.out.println("is car1 same as the car 3 "+ car1.equals(car3));
			System.out.println("is car2 same as the car 3 "+ car2.equals(car3));
		
		}
		
}