package com.manauwar.springboot.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {
	
	//getTopics()
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)

}
