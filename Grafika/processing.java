//odcienie szarosci.

PImage source;
PImage destination;
void setup() {
 size(450, 300);
 source = loadImage("zamek.jpg");
 destination = createImage(source.width, source.height, RGB);
}
void draw() {
 //float threshold = 200;
 int number = 60;
 float[] thresholds = new float[number];
 float val = 255/number;
 for(int i =0; i < number; i++){
   thresholds[i] = i*val;
 }
 source.loadPixels();
 destination.loadPixels();
 for (int x = 0; x < source.width; x++) {
   for (int y = 0; y < source.height; y++ ) {
     int loc = x + y*source.width;
     for(int i = 0; i < number; i++){
       if(brightness(source.pixels[loc]) > thresholds[i])
       destination.pixels[loc] = color((int)thresholds[i]);
     }
     /*if (brightness(source.pixels[loc]) > threshold) {
       destination.pixels[loc] = color(255);
     } else {
       destination.pixels[loc] = color(0);
     }*/
   }
 }
 destination.updatePixels();
 image(source,0,0);
 image(destination,225,0);
}