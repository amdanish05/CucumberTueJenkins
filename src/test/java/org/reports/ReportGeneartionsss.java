package org.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGeneartionsss {
	
	
	
		
		
		
		public static void generateJvmReport(String jsonFile) {
			File file=new File("target");
			
			Configuration configuration=new Configuration(file, "Sample Project");
			configuration.addClassifications("Platform", "Win 10");
			configuration.addClassifications("Browser", "Chrome");
			configuration.addClassifications("Sprint no", "22");

			
			List<String>li=new ArrayList<String>();
			li.add(jsonFile);
			ReportBuilder builder=new ReportBuilder(li, configuration);
			builder.generateReports();
		}
	}

