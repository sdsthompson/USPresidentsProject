package com.skilldistillery.presidents.data;

import java.util.ArrayList;
import java.util.List;

public class PresidentDAOFileImpl implements PresidentDAO {
  List<President> presidents = new ArrayList<>();

  @Override
  public President getPresidentByTermNumber(int term) {
    return null;
  }

  @Override
  public List<President> getAllPresidents() {
    return null;
  }

}
