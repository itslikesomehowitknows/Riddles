package com.ilsik.core.Interfaces;

import java.util.List;

public interface ICore {

	String RandomQuestion(); //returns a random question
	String SpecificQuestion(int id); //returns the question for the specific riddle
	String Answer(int id);//returns the answer for the specific riddle
	List<String> GetQuestionResponses(int id);//returns a list of type string with all responses
	int GetHighScore(int playerId);
}
