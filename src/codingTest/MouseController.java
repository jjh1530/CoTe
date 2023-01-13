package codingTest;

import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Timer;
import java.util.TimerTask;

public class MouseController {
	public static void main(String[] args) {
		try {
			Robot r = new Robot();
			//마우스 위치 잡기
			/*
			Timer t = new Timer();
			TimerTask timerTask = new TimerTask() {
			 	@Override
				public void run() {
					PointerInfo pt = MouseInfo.getPointerInfo();

					System.out.println(pt.getLocation()); // x,y
				}
			};
			
			// x 2538 84
			// // 2575 21
			t.schedule(timerTask, 0, 3000);
			*/
			int x = 2538;
			int y = 84;
			int x2 = 2575;
			int y2 = 21;
			
			while( x !=0) {
				r.mouseMove(x, y);
				r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				r.delay(2000);
				r.mouseMove(x2, y2);
				r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				r.delay(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
