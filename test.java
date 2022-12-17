


public class test {
	
	public static void main (String[] args) {
		int i,y,V,T;
		String J1,J2,x;
		int [][] coupjoueur= {{3,3,3},{3,3,3}};
		
		int[][][] plateau = {
			{
			{0,0,0},{0,0,0},{0,0,0}
			},
			{
			{0,0,0},{0,0,0},{0,0,0}
			},
			{
			{0,0,0},{0,0,0},{0,0,0}
			}
			};
			
			System.out.println("donnez le nom du premier joueur");
		J1=Lire.S();
		System.out.println("donnez le nom du deuxième joueur");
		J2=Lire.S();
		
		
		
		V=0;
i=0;
while(V==0){
	if (i%2==0){ //changement joueur 
		x=J1;
		y=1;  //numéro assigné au joueur
	} else {
		x=J2;
		y=2; //numéro assigné au joueur
	}
	
	T=choixtaillecercle(coupjoueur,y,x); //appel sous programme
	(coupjoueur[y-1][T-1])=((coupjoueur[y-1][T-1])-1);//retrait du pions dans le stock du joueur
	
	coup(plateau,x,T,y);
	
	V=victoire(plateau,V,y,x);
	
	
	
	if(V==0){
	System.out.println("il n'y a aucune victoire, vous pouvez continuer");
	}
	i=i+1;
	}
}//////////////////////////////////////////////////////////////////////////////////////////////////
	public static int victoire(int [][][]plateau,int y, int V, String x){ // sous programme avec toutes les conditions de victoire 
		V=(victoirediagonale(plateau,y,V,x));
		System.out.println(V);
		return(V);
		}
	
	
	
	
	public static int choixtaillecercle( int [][]coupjoueur, int y, String x){
		int T;
		T=0;
	
System.out.println(x+", choisissez une taille de cercle : 1 pour le petit, 2 pour le moyen, 3 pour le grand");
T=Lire.i();
while((T!=1)&(T!=2)&(T!=3)){
	System.out.println(x+", choisissez une VRAIE taille de cercle ");
	T=Lire.i();
}
while(coupjoueur[y-1][T-1]==0){
	System.out.println("Il n'y a plus de cercle de cette taille maintenant ! Choisissez une autre taille");
	T=Lire.i();
	while((T!=1)&(T!=2)&(T!=3)){
		System.out.println(x+", choisissez une VRAIE taille de cercle ");
		T=Lire.i();
	}
}
return T;
}
	
public static int victoirediagonale(int [][][] plateau, int y,int V, String x){
	 if(((plateau[0][0][0])==(plateau[1][1][1]))&((plateau[1][1][1])==(plateau[2][2][2]))){
			if(plateau[0][0][0]==y){
				System.out.println("il y a une victoire de "+x+ " par allignement croissant dans la diagonale 1");
				V=V+1;
				}
		}
		if(((plateau[0][0][2])==(plateau[1][1][1]))&((plateau[1][1][1])==(plateau[2][2][0]))){
			if(plateau[0][0][2]==y){
				System.out.println("il y a une victoire de "+x+ " par allignement decroissant dans la diagonale 1");
				V=V+1;
				
		}		
	}
		if(((plateau[2][0][0])==(plateau[1][1][1]))&((plateau[1][1][1])==(plateau[0][2][2]))){
			if(plateau[2][0][0]==y){
				System.out.println("il y a une victoire de "+x+ " par allignement croissant dans la diagonale 2");
				V=V+1;
				
		}
	}
	if(((plateau[2][0][2])==(plateau[1][1][1]))&((plateau[1][1][1])==(plateau[0][2][0]))){
			if(plateau[2][0][2]==y){
				System.out.println("il y a une victoire de "+x+ " par allignement decroissant dans la diagonale 2");
				V=V+1;
				
		}
	}
		return V;
}

			
	public static void coup(int [][][] plateau, String x, int T,int y){
	int C=0, L=0;
	System.out.println(x+", choissisez une colonne");
	C=Lire.i();
	while((C!=1)&(C!=2)&(C!=3)){
		System.out.println(x+", choissisez une VRAIE colonne");
		C=Lire.i();
	}
	

	
	System.out.println(x+", choissisez une ligne");
	L=Lire.i();
	while((L!=1)&(L!=2)&(L!=3)){
		System.out.println(x+", choissisez une VRAIE ligne");
		L=Lire.i();
	}
while(plateau[C-1][L-1][T-1]!=0){
	System.out.println("cette case est déja prise, choisissez en une autre");
	System.out.println(x+", choissisez une colonne");
	C=Lire.i();
	while((C!=1)&(C!=2)&(C!=3)){
		System.out.println(x+", choissisez une VRAIE colonne");
		C=Lire.i();
	}
	System.out.println(x+", choissisez une ligne");
	L=Lire.i();
	while((L!=1)&(L!=2)&(L!=3)){
		System.out.println(x+", choissisez une VRAIE ligne");
		L=Lire.i();
	}
	
	}
plateau[C-1][L-1][T-1]=y;
	 
	
		}
}

