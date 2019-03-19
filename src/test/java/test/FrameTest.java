package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

/**
 * A JPanel to be run within a JFrame to test if the JFrame is sizing correctly.
 * 
 * @author Jared N. Plumb
 * @version 1.0
 * @since 2018-06-22
 */
public class FrameTest extends JPanel {

	public FrameTest() {
		this.getFontMetrics(FONT); // This is a hack to fix a Java font bug
		this.setPreferredSize(new Dimension(770, 460));
		this.setOpaque(true);
		this.setBackground(Color.DARK_GRAY);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setFont(FONT);
		g2.setColor(Color.YELLOW);
		for (int i = 0; i < ART.length; i++)
			g2.drawString(ART[i], 10, 10 + i * 16);
	}

	private static final long serialVersionUID = -6369576050982803676L;
	private static final Font FONT = new Font("Lucida Sans Typewriter", Font.BOLD, 16);
	private static final String[] ART = new String(
			"                              _\n                            ==(W{==========-      /===-\n                              ||  (.--.)         /===-_---~~~~~~~~~------____\n                              | \\_,|**|,__      |===-~___                _,-' `\n                 -==\\\\        `\\ ' `--'   ),    `//~\\\\   ~~~~`---.___.-~~\n             ______-==|        /`\\_. .__/\\ \\    | |  \\\\           _-~`\n       __--~~~  ,-/-==\\\\      (   | .  |~~~~|   | |   `\\        ,'\n    _-~       /'    |  \\\\     )__/==0==-\\<>/   / /      \\      /\n  .'        /       |   \\\\      /~\\___/~~\\/  /' /        \\   /'\n /  ____  /         |    \\`\\.__/-~~   \\  |_/'  /          \\/'\n/-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`\n                  \\_|      /        _) | ;  ),   __--~~\n                    '~~--_/      _-~/- |/ \\   '-~ \\             \n                   {\\__--_/}    / \\\\_>-|)<__\\      \\\n                   /'   (_/  _-~  | |__>--<__|      | \n                  |   _/) )-~     | |__>--<__|      |   \n                  / /~ ,_/       / /__>---<__/      |  \n                 o-o _//        /-~_>---<__-~      / \n                 (^(~          /~_>---<__-      _-~              \n                ,/|           /__>--<__/     _-~                 \n             ,//('(          |__>--<__|     /                  .----_ \n            ( ( '))          |__>--<__|    |                 /' _---_~\\\n         `-)) )) (           |__>--<__|    |               /'  /     ~\\`\\\n        ,/,'//( (             \\__>--<__\\    \\            /'  //        ||\n      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'\n    `~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/ \n  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~ \n   ;'( ')/ ,)(                              ~~~~~~~~~~ \n    '   '  `             ")
					.split("\n");
}
