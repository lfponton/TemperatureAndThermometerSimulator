package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime
{
  private Date date;

  public DateTime() { date = Calendar.getInstance().getTime();
  }

  public String getTimeStamp() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    return sdf.format(date);
  }
}
