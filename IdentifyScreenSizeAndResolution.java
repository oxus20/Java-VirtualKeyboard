import java.awt.Dimension;
import java.awt.Toolkit;

public class IdentifyScreenSizeAndResolution {
	public static void main(String[] a) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		System.out.println("Screen Size: " + d.width + "x" + d.height);
		System.out.println("Screen Resolution: " + tk.getScreenResolution());
	}
}