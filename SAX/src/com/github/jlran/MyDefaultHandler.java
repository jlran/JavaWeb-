package com.github.jlran;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyDefaultHandler extends DefaultHandler {
	//��ʼ�ĵ�ʱ����
	@Override
	public void startDocument() throws SAXException {
		System.out.println("�ĵ���ʼ����...");
	}
	/*
	 * ��ʼ��ǩʱ����
	 * @param qName: ��ʾ��ʼ��ǩ�ı�ǩ��
	 * @param attributes: ��ʾ��ʼ��ǩ�ڰ����������б�
	 */
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.println("startElement->" + qName);
	}
	/*
	 *  ������ǩʱ����
	 * @param qName: ������ǩ�ı�ǩ����
	 */
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println("endElement->" + qName);
	}
	/*
	 * �����ı����ݵ�ʱ����
	 * @param ch: ��ʾ��ǰ����������ı�����
	 * @param start�� ��ʾ��ǰ�ı����ݵĿ�ʼλ��
	 * @param length: ��ʾ��ǰ�ı����ݵĳ���(non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int)
	 */
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String string = new String(ch, start, length);
		System.out.println("characters->" + string);
	}
	/*
	 * �����ĵ�ʱ����
	 */
	@Override
	public void endDocument() throws SAXException {
		System.out.println("�ĵ���������...");
	}
}
