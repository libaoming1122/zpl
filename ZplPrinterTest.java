/*	private static boolean printPicking203DPI(ZplPrinter p) {
		// 左边的条码
		String bar1 = "07";
		p.setChar(bar1, 126, 86, 40, 40);
		String bar1Zpl = "^FO66,133^BY5,3.0,160^BCR,,N,N,N^FD${data}^FS";// 条码样式模板
		p.setBarcode(bar1, bar1Zpl);
		// 下边的条码
		String bar2 = "00000999990018822969";// 20位
		String bar2Paper = "^FO253,400^BY2,3.0,66^BCN,,Y,N,N^FD${data}^FS";// 条码样式模板
		p.setBarcode(bar2, bar2Paper);
		p.setText("国药控股湖南有限公司", 253, 26, 40, 40, 20, 1, 1, 24);
		p.setChar("CSS0BPKPPR", 253, 66, 20, 20);
		p.setText("09件", 626, 53, 40, 40, 20, 1, 1, 24);
		p.setText("补", 733, 53, 40, 40, 20, 1, 1, 24);
		p.setText("公司自配送 公路", 253, 120, 53, 53, 20, 1, 1, 24);
		p.setChar("03231151", 626, 124, 26, 26);
		p.setChar("2015-10-10", 626, 151, 20, 20);
		p.setText("湖南六谷大药房连锁有限公司", 253, 173, 40, 40, 20, 1, 1, 24);
		p.setText("长沙市开福区捞刀河镇中岭村258号", 253, 213, 30, 30, 20, 1, 1, 22);
		p.setText("多SKU", 533, 323, 40, 40, 20, 1, 1, 24);
		p.setText("库位:49", 253, 280, 37, 37, 20, 1, 1, 24);
		p.setText("品类:感冒胶囊", 253, 323, 37, 37, 20, 1, 1, 24);
		p.setText("批号:", 253, 366, 37, 37, 20, 1, 1, 24);
		p.setChar("78787878788", 333, 373, 26, 26);
		String zpl = p.getZpl();
		System.out.println(zpl);
		boolean result = p.print(zpl);

		return result;

	}*/

/*	private static boolean printBarcode(ZplPrinter p) {
		// 1.打印单个条码
		String bar0 = "131ZA010101";// 条码内容
		// String bar0Zpl =
		// "^FO110,110^BY6,3.0,280^BCN,,Y,N,N^FD${data}^FS";//条码样式模板
		String bar0Zpl = "^FO80,350^AAN,100,110^BY4,2.0,200^BCN,,N,N,N^FD${data}^FS";// 条码样式模板
		p.setBarcode(bar0, bar0Zpl);
		p.setChar(bar0, 100, 190, 140, 110);
		p.setText("库位条形码", 880, 380, 60, 60, 30, 4, 4, 24);
		String zpl = p.getZpl();
		System.out.println(zpl);
		boolean result = p.print(zpl);// 打印
		return result;
	}*/

		private static boolean printRestoking(ZplPrinter p, String bar1) {
		// 上方的条码编号
		String bar1Zpl = "^FO80,350^AAN,100,110^BY4,2.0,200^BCN,,N,N,N^FD${data}^FS";// 条码样式模板
		p.setBarcode(bar1, bar1Zpl);
		p.setText(bar1, 80, 300, 30, 40, 30, 1, 1, 24);
		// 源货位
		p.setText("货品名称:", 40, 70, 30, 30, 20, 1, 1, 24);
		// 目标货位
		p.setText("货品规格:", 500, 70, 30, 30, 20, 1, 1, 24);
		// 货品编号
		p.setText("货品单价:", 40, 150, 30, 30, 20, 1, 1, 24);
		// 生产日期
		p.setText("出厂日期:"+DateUtils.getDate(), 500, 150, 30, 30, 10,1, 1, 24);
		// 生产厂家
		p.setText("生产厂家:", 40, 220, 30, 30, 20, 1, 1, 24);
		String zpl = p.getZpl();
		System.out.println(zpl);
		boolean result = p.print(zpl);
		return result;
	}
	