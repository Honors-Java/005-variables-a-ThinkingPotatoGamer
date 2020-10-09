int width = 500;
int height = 500;

void setup() {
	size(width, height);
}

void draw() {
  // Step 1: Write code that draws the screenshot in the files 
  // with hard-coded values. (Feel free to use colors 
  // instead of grayscale.)

  // Step 2: Replace all of the hard-coded numbers with 
  // variables.

  // Step 3: Write assignment operations in draw() that 
  // change the value of the variables.
  // For example, “variable1 = variable1 + 2;”. 
  // Try different expressions and see what happens!

  background(255);
  stroke(0);
  fill(175);

  ellipse(width / 4, height / 4, width / 4, height / 4);
  ellipse(width / 4, height * 3 / 4, width / 4, height / 4);
  ellipse(width * 3 / 4, height / 4, width / 4, height / 4);
  ellipse(width * 3 / 4, height * 3 / 4, width / 4, height / 4);
 
}