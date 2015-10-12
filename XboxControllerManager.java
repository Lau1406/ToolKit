// As created by Laurence Keijzer on 12-10-2015
// Created using IntelliJ IDEA


import ch.aplu.xboxcontroller.XboxController;
import ch.aplu.xboxcontroller.XboxControllerAdapter;

public class XboxControllerManager {

	public boolean btnA, btnB, btnX, btnY, btnBack, btnStart, btnLeftShoulder, btnRightSholder, btnLeftThumb,
			btnRightThumb, btnDpad, isConnected;
	public double valueRightTrigger, valueLeftTrigger, magnitudeLeftThumb, magnitudeRightThumb, directionLeftThumb,
			directionRightThumb;
	int directionDpad;


	XboxController xboxController = new XboxController();

	XboxControllerManager() {

		if( !xboxController.isConnected() ) {
			xboxController.release();
		}else {
			xboxController.addXboxControllerListener(new XboxControllerAdapter() {
				public void buttonA( boolean pressed ) {
					btnA = pressed;
				}

				public void buttonB( boolean pressed ) {
					btnB = pressed;
				}

				public void buttonX( boolean pressed ) {
					btnX = pressed;
				}

				public void buttonY( boolean pressed ) {
					btnY = pressed;
				}

				public void back( boolean pressed ) {
					btnBack = pressed;
				}

				public void start( boolean pressed ) {
					btnStart = pressed;
				}

				public void leftShoulder( boolean pressed ) {
					btnLeftShoulder = pressed;
				}

				public void rightShoulder( boolean pressed ) {
					btnRightSholder = pressed;
				}

				public void leftThumb( boolean pressed ) {
					btnLeftThumb = pressed;
				}

				public void rightThumb( boolean pressed ) {
					btnRightThumb = pressed;
				}

				public void dpad( int direction, boolean pressed ) {
					btnDpad = pressed;
					directionDpad = direction;
				}

				public void leftTrigger( double value ) {
					valueLeftTrigger = value;
				}

				public void rightTrigger( double value ) {
					valueRightTrigger = value;
				}

				public void leftThumbMagnitude( double magnitude ) {
					magnitudeLeftThumb = magnitude;
				}

				public void leftThumbDirection( double direction ) {
					directionLeftThumb = direction;
				}

				public void rightThumbMagnitude( double magnitude ) {
					magnitudeRightThumb = magnitude;
				}

				public void rightThumbDirection( double direction ) {
					directionRightThumb = direction;
				}

				public void isConnected( boolean connected ) {
					isConnected = connected;
				}
			});
		}
	}

}
