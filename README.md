# Java Virtual Keyboard
A Virtual Keyboard is considered to be a component to use on computers without a real keyboard e.g. **Touch Screen Computers** and **Smart Phones**; where a mouse can utilize the keyboard functionality and features.
 
In addition, Virtual Keyboard used for the following subjects:
 
- Foreign Character Sets
- Touchscreen
- Bypass Key Loggers
- etc.

**Important Notes:**

- You must to have an Image named **oxus.PNG** inside the root directory of your project.
  

## Toolkit Class
**Toolkit Class** feature and functionality enables you to control the Caps Lock Key of the Keyboard using Java Toolkit class. Regarding to the Caps Lock Key state you can do and accomplish followings:

- Turn Caps Lock Key ON as follow:

 ```java
 Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, true);
 ```

- Turn Caps Lock Key OFF

 ```java
 Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_CAPS_LOCK, false);
 ```

- Check whether Caps Lock Key is ON or OFF?

 ```java
 boolean isOn = Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_CAPS_LOCK);

 System.out.println("CapsLock button is " + (isOn ? "on" : "off"));
 ```
 
## Robot Class
**java.awt.Robot class** is used to take the control of mouse and keyboard. Once you get the control, you can do any kind of operations related to the mouse and keyboard through your java code. 

This class is used generally for the purposes of **test automation**, **self-running demos**, and other applications where control of the mouse and keyboard is needed.

**java.awt.Robot class** has the following three main functionalities:

- Mouse control
- Keyboard control
- Screen capture.


For further information refer to the [http://www.slideshare.net/absherzad/java-virtual-keyboard-using-robot-toolkit-and-jtogglebutton-classes)
 
[Follow us on Facebook](https://www.facebook.com/Oxus20)