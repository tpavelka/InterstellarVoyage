

public class StarMath {
	/**
	 * Gets the Cartesian coordinates of a star
	 * @param star the star you want to get the Cartesian coordinates from
	 * @return returns an array of decimals containing the location of the star relative to the sun xPos = array[0], yPos = array[1], zPos = array[2],
	 */
	public double[] getCartesianCoords(Stars star){
		double TRAhrs = star.getRAh()+(star.getRAm()/60)+(star.getRAs()/(60*60));
		double TRAdeg = TRAhrs*15;
		double TDdeg;
		if(star.getDdeg()<0){
			TDdeg = star.getDdeg()+(-star.getDdegm()/60);
		} else {
			TDdeg = star.getDdeg()+(star.getDdegm()/60);
		}
		double TRArad = (TRAdeg/180)*Math.PI;
		double TDrad = (TDdeg/180)*Math.PI;
		double xPos = star.getDist()*Math.cos(TDrad)*Math.cos(TRArad);
		double yPos = star.getDist()*Math.cos(TDrad)*Math.sin(TRArad);
		double zPos = star.getDist()*Math.sin(TDrad);
		double[] position = {xPos, yPos, zPos};
		return position;
	}
	/**
	 * This method calculates the distance between two stars
	 * @param star1 the first star
	 * @param star2 the second star
	 * @return returns the 3D distance between the stars
	 */
	public double calculateDistanceBetweenStars(Stars star1, Stars star2){
		double[] positionOfStar1 = getCartesianCoords(star1);
		double[] positionOfStar2 = getCartesianCoords(star2);
		double[] changeInPositionOfStars = {Math.abs(positionOfStar1[0]-positionOfStar2[0]), Math.abs(positionOfStar1[1]-positionOfStar2[1]), Math.abs(positionOfStar1[2]-positionOfStar2[2])};
		double distance = Math.sqrt(sqared(changeInPositionOfStars[0])+sqared(changeInPositionOfStars[1])+sqared(changeInPositionOfStars[2]));
		return distance;
	}
	/**
	 * A beautiful squaring method
	 * @param d the number to square
	 * @return the number squared
	 */
	public double sqared(double d){
		return d = d*d;
	}
}
