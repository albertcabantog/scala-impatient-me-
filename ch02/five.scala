  def countdown(n: Int) {
    for (i <- n until(0, -1)) println(i)
  }
  
  countdown(7)