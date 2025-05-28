# Java has 8 primitives types
Numericals:
- byte
- short
- int
- long

Numericals with decimal point:
- float
- double

Character:
- char

Booleans:
- boolean

# Numerical literal can have underscore
example;
- int million = 1_000_000;
- double hundred = 1_0_0.0_0

Invalid underscore places at:
- begining of a literal
- end of a literal
- before a decimal point
- after a decimal point
Invlaid places will NOT COMPILE!

# Wrapper for primitive classes
Only numerical wrapper have overloaded 'valueOf'-methods that takes a base (radius) value, for example
Integer.valueOf("111",2); // 111 in binary => 7 in decimal

All of the numeric classes extend the 'Number' class!

# Char and String literals
Literals of type 'char' and 'String' may contain any 'Unicode' (UTF-16) characterss.
For example;
- char c = '\u0108' // same as the character C
- String s = "S\u00ED Se\u00F1or" // same as Sí Señor

