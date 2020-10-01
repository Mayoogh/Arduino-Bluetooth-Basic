## Usage of other GPIO for serial communication 

`BT_changed_transmission_lines.ino` code consist of a library `SoftwareSerial`.

This Library allows you to select your own Tx and Rx pins.

For eg: In code, pins (3,2) is taken which means pin 3 of MCU is connected with Rx of BT and pin 2 to Tx of BT.

The default Tx,Rx pins can be used for other purposes.

Multiple serial port can be defined using this library

Syntax : `SoftwareSerial mySerial(receivePin, transmitPin)`

<br><br><br><br>

Read more at here [[1]](https://www.arduino.cc/en/Reference.SoftwareSerial) [[2]](https://www.renesas.com/us/en/products/gadget-renesas/reference/gr-adzuki/library-softwareserial.html)

