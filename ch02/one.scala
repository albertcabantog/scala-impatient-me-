def signum(n: Int) = {
     if (n > 0) n
     else if (n < 0) -1
     else 0
  }
  
signum(10) //res6: Int = 10
signum(0) //res7: Int = 0
signum(-99) //res8: Int = -1
