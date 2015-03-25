package com.krithika.training.spring.aspect;

public class BraveKnight extends Knight {
		
	private Quest quest;
	private Minstrel minstrel;
	
	public BraveKnight(Quest quest, Minstrel minstrel) {
			this.quest = quest;
			this.minstrel = minstrel;
		}
	public void embarkOnQuest() throws QuestException {
		minstrel.singBeforeQuest();
		quest.embark();
		minstrel.singAfterQuest();
	}
	
}
