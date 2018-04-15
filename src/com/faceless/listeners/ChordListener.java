package com.faceless.listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.faceless.core.Main;

public class ChordListener implements MouseListener
{

	@Override
	public void mouseClicked(MouseEvent e)
	{
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{

	}

	@Override
	public void mouseExited(MouseEvent e)
	{

	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		int x = e.getX();
		int y = e.getY();
		int n = Math.floorDiv(y, 45);
		int l = Math.floorDiv(x - 20, 45);
		if (n < 6)
		{
			System.out.println(l + 1 + "|" + Main.chord[n]);
			switch (l)
			{
			case -1:
				Main.chord[n] = Main.chord[n] == "X" ? "0" : "X";
				break;
			default:
				if (Main.chord[n] != "X" && Main.chord[n] != "0")
				{
					int ch = Integer.parseInt(Main.chord[n]);
					Main.chord[n] = ch == l + 1 ? "0" : "" + (l + 1);
					System.out.println(ch == l + 1);
				}
				else
				{
					Main.chord[n] = "" + (l + 1);
				}
				break;
			}
			e.getComponent().repaint();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{

	}

}