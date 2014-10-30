import java.awt.*;
import java.applet.Applet;

public class AppletEx3 extends Applet {
	Image img = null;

	public void init() {
		img = getImage(getDocumentBase(), getParameter("imgName"));
	}

	public void paint(Graphics g) {
		// Image의 크기를 얻는다.
	    int imgWidth = img.getWidth(this); // getWidth(ImageObserver obj)
	    int imgHeight = img.getHeight(this); //getHeight(ImageObserver obj)

	    // 이미지를 Frame의 중앙에 출력한다.
         g.drawImage(img, (getWidth()-imgWidth)/2, (getHeight()-imgHeight)/2, this);
	}
} // class