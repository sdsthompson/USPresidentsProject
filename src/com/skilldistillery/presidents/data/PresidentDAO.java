package com.skilldistillery.presidents.data;

import java.util.List;

public interface PresidentDAO {
  President getPresidentByTermNumber(int term);
  List<President> getAllPresidents();

}
