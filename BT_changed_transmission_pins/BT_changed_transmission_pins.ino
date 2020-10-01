
#include <SoftwareSerial.h>

char state = '0';

SoftwareSerial BT(3,2); // BT(Tx,Rx)

void setup() { 
BT.begin(9600); // Initialize serial communication at 9600 bits per second

Serial.begin(9600);
} 
void loop() { 
  
Serial.begin(9600);
  if(BT.available()){ 
  // Reads from bluetooth and stores its value
    state = BT.read();
   // Write your Code here
   // Better to use switch function
}
}
