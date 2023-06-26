import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BedenKitleIndeksiHesaplama 
{
	
	public static String ad;
	public static String soyad;
	public static int yas;
	public static float kilo;
	public static float boy;
	public static float sonuc;
	
	
	public static void main(String[] args) 
	{
		//pencere oluşturmak için nesne yapıldı.
		JFrame anaPencereFrame = new JFrame();
		
		
		// penreceye başlık verelim
		anaPencereFrame.setTitle("Beden Kitle İndeksi");
		
		
		//pencereye boyut verelim
		anaPencereFrame.setSize(500,400);
		
		
		//pencerenin x butonuna basıldığında gerçekleşecek olay
		anaPencereFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// pencere kapanınca program da kapansın demek
				
		
		// pencere ekranın ortasında çıksın
		anaPencereFrame.setLocationRelativeTo(null);
		// null yerine başka bir pencerenin adı yazılırsa adı yazılan pencerenin ortasında çıkar
		
		
		//panel oluşturma
		JPanel anaPanel = new JPanel();
		anaPanel.setBorder(BorderFactory.createTitledBorder("Hesaplama"));//Hesaplama adında başlık oluşturduk.
		anaPanel.setLayout(null); //nesneleri pencerede ortalaması için
		anaPencereFrame.add(anaPanel);// panel pencereye eklendi.
		
		
		// nesne oluşturma
		JLabel yasJLabel =new JLabel("Yaş:");
		JLabel boyJLabel = new JLabel("Boy:(Örnek: 1.72)");
		JLabel kiloJLabel = new JLabel("Kilo:");
		JLabel bkiJLabel = new JLabel("BKİ:");
		JLabel kiloDurumuJLabel = new JLabel("Kilo Durumu:");
		
		
		
		
		JTextField yasField = new JTextField(10);
		JTextField boyField = new JTextField(10);
		JTextField kiloField = new JTextField(10);
		JTextField bkiField = new JTextField(10);
		JTextField kiloDurumuField = new JTextField(10);
		
		
		
		JButton hesaplaButton = new JButton("Hesapla");
		JButton cikisButton = new JButton("Çıkış");
		
		
		
		//nesneleri konumlandıralım
		yasJLabel.setBounds(10,10,100,30);
		boyJLabel.setBounds(10,50,100,30);
		kiloJLabel.setBounds(10,90,100,30);
		bkiJLabel.setBounds(10,130,100,30);
		kiloDurumuJLabel.setBounds(10,180,100,30);
		
		

		yasField.setBounds(120,10,100,30);
		boyField.setBounds(120,50,100,30);
		kiloField.setBounds(120,90,100,30);
		bkiField.setBounds(120,130,100,30);
		kiloDurumuField.setBounds(120,180,100,30);
		
		hesaplaButton.setBounds(10,230,100,30);
		cikisButton.setBounds(120,230,100,30);
		
		//nesneleri panele ekleme
		anaPanel.add(yasJLabel);
		anaPanel.add(boyJLabel);
		anaPanel.add(kiloJLabel);
		anaPanel.add(bkiJLabel);
		anaPanel.add(kiloDurumuJLabel);
		anaPanel.add(yasField);
		anaPanel.add(boyField);
		anaPanel.add(kiloField);
		anaPanel.add(bkiField);
		anaPanel.add(kiloDurumuField);
		anaPanel.add(hesaplaButton);
		anaPanel.add(cikisButton);
		
		
		hesaplaButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				boy = Float.parseFloat(boyField.getText());
				kilo = Float.parseFloat(kiloField.getText());
				
				sonuc = kilo / (boy*boy);
				bkiField.setText(Float.toString(sonuc));
				
				if(sonuc<=18.5)
				{
					kiloDurumuField.setText("Zayıf");
				}
				else if(sonuc>18.5 && sonuc<=24.9)
				{
					kiloDurumuField.setText("Normal");
				}
				else if(sonuc>24.9 && sonuc<=29.9)
				{
					kiloDurumuField.setText("Fazla Kilolu");
				}
				else if(sonuc>29.9 && sonuc<=34.9)
				{
					kiloDurumuField.setText("Obez-I.Sınıf");
				}
				else if(sonuc>34.9 && sonuc<=44.9)
				{
					kiloDurumuField.setText("Obez-II.Sınıf");
				}
				else
				{
					kiloDurumuField.setText("Obez-III.Sınıf");
				}
				
				
				
			}
		});
		
		cikisButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				int sonuc = JOptionPane.showConfirmDialog(null, "Çıkış yapmak istiyor musunuz?");
				
				if(sonuc == 0)//KULLANICI ÇIKAN KUTUCUKTA YES TUŞUNA BASARSA:
				{
					System.exit(0);//PROGRAMI KAPATIR					
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Devam ediyoruz.");
				}
				
				
			}
		});
		
		
		anaPencereFrame.setVisible(true);
		
	}

}
