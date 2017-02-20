  def product(letters: String) : BigInt = {
    var result = 1;
    for(letter <- letters) result *= letter;
    result;
  }
  
  product("Hello")