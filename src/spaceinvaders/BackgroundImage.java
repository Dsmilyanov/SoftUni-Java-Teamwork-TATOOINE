package spaceinvaders;

import javax.swing.ImageIcon;

public class BackgroundImage extends Sprite {
	private final String bground = "../spacepix/bground.png";
	
	public BackgroundImage() {
		ImageIcon ii = new ImageIcon(this.getClass().getResource(bground));
		setImage(ii.getImage());
	}
}
